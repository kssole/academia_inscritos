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
@Table(name = "nivel_inscrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelInscrito.findAll", query = "SELECT n FROM NivelInscrito n"),
    @NamedQuery(name = "NivelInscrito.findByIdNivelInscrito", query = "SELECT n FROM NivelInscrito n WHERE n.idNivelInscrito = :idNivelInscrito"),
    @NamedQuery(name = "NivelInscrito.findByAutorizacion", query = "SELECT n FROM NivelInscrito n WHERE n.autorizacion = :autorizacion"),
    @NamedQuery(name = "NivelInscrito.findByIdEstudiantes", query = "SELECT n FROM NivelInscrito n WHERE n.idEstudiantes = :idEstudiantes"),
    @NamedQuery(name = "NivelInscrito.findByIdNivel", query = "SELECT n FROM NivelInscrito n WHERE n.idNivel = :idNivel")})
public class NivelInscrito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel_inscrito")
    private Integer idNivelInscrito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "autorizacion")
    private String autorizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estudiantes")
    private int idEstudiantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel")
    private int idNivel;

    public NivelInscrito() {
    }

    public NivelInscrito(Integer idNivelInscrito) {
        this.idNivelInscrito = idNivelInscrito;
    }

    public NivelInscrito(Integer idNivelInscrito, String autorizacion, int idEstudiantes, int idNivel) {
        this.idNivelInscrito = idNivelInscrito;
        this.autorizacion = autorizacion;
        this.idEstudiantes = idEstudiantes;
        this.idNivel = idNivel;
    }

    public Integer getIdNivelInscrito() {
        return idNivelInscrito;
    }

    public void setIdNivelInscrito(Integer idNivelInscrito) {
        this.idNivelInscrito = idNivelInscrito;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
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
        hash += (idNivelInscrito != null ? idNivelInscrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelInscrito)) {
            return false;
        }
        NivelInscrito other = (NivelInscrito) object;
        if ((this.idNivelInscrito == null && other.idNivelInscrito != null) || (this.idNivelInscrito != null && !this.idNivelInscrito.equals(other.idNivelInscrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.NivelInscrito[ idNivelInscrito=" + idNivelInscrito + " ]";
    }
    
}
