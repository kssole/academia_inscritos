/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripciones;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "nivel_aprobado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelAprobado.findAll", query = "SELECT n FROM NivelAprobado n"),
    @NamedQuery(name = "NivelAprobado.findByIdNivelAprobado", query = "SELECT n FROM NivelAprobado n WHERE n.idNivelAprobado = :idNivelAprobado"),
    @NamedQuery(name = "NivelAprobado.findByEstado", query = "SELECT n FROM NivelAprobado n WHERE n.estado = :estado"),
    @NamedQuery(name = "NivelAprobado.findByIdEstudiantes", query = "SELECT n FROM NivelAprobado n WHERE n.idEstudiantes = :idEstudiantes"),
    @NamedQuery(name = "NivelAprobado.findByIdNivel", query = "SELECT n FROM NivelAprobado n WHERE n.idNivel = :idNivel")})
public class NivelAprobado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel_aprobado")
    private Integer idNivelAprobado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estudiantes")
    private int idEstudiantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel")
    private int idNivel;

    public NivelAprobado() {
    }

    public NivelAprobado(Integer idNivelAprobado) {
        this.idNivelAprobado = idNivelAprobado;
    }

    public NivelAprobado(Integer idNivelAprobado, String estado, int idEstudiantes, int idNivel) {
        this.idNivelAprobado = idNivelAprobado;
        this.estado = estado;
        this.idEstudiantes = idEstudiantes;
        this.idNivel = idNivel;
    }

    public Integer getIdNivelAprobado() {
        return idNivelAprobado;
    }

    public void setIdNivelAprobado(Integer idNivelAprobado) {
        this.idNivelAprobado = idNivelAprobado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdEstudiantes() {
        return idEstudiantes;
    }

    public void setIdEstudiantes(int idEstudiantes) {
        this.idEstudiantes = idEstudiantes;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelAprobado != null ? idNivelAprobado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelAprobado)) {
            return false;
        }
        NivelAprobado other = (NivelAprobado) object;
        if ((this.idNivelAprobado == null && other.idNivelAprobado != null) || (this.idNivelAprobado != null && !this.idNivelAprobado.equals(other.idNivelAprobado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.NivelAprobado[ idNivelAprobado=" + idNivelAprobado + " ]";
    }
    
}
