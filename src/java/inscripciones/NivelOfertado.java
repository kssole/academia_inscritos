/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripciones;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "nivel_ofertado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelOfertado.findAll", query = "SELECT n FROM NivelOfertado n"),
    @NamedQuery(name = "NivelOfertado.findByIdNivelOfertado", query = "SELECT n FROM NivelOfertado n WHERE n.idNivelOfertado = :idNivelOfertado"),
    @NamedQuery(name = "NivelOfertado.findByCupos", query = "SELECT n FROM NivelOfertado n WHERE n.cupos = :cupos"),
    @NamedQuery(name = "NivelOfertado.findByIdNivel", query = "SELECT n FROM NivelOfertado n WHERE n.idNivel = :idNivel"),
    @NamedQuery(name = "NivelOfertado.findByIdAcademia", query = "SELECT n FROM NivelOfertado n WHERE n.idAcademia = :idAcademia")})
public class NivelOfertado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel_ofertado")
    private Integer idNivelOfertado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cupos")
    private int cupos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel")
    private int idNivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_academia")
    private int idAcademia;

    public NivelOfertado() {
    }

    public NivelOfertado(Integer idNivelOfertado) {
        this.idNivelOfertado = idNivelOfertado;
    }

    public NivelOfertado(Integer idNivelOfertado, int cupos, int idNivel, int idAcademia) {
        this.idNivelOfertado = idNivelOfertado;
        this.cupos = cupos;
        this.idNivel = idNivel;
        this.idAcademia = idAcademia;
    }

    public Integer getIdNivelOfertado() {
        return idNivelOfertado;
    }

    public void setIdNivelOfertado(Integer idNivelOfertado) {
        this.idNivelOfertado = idNivelOfertado;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(int idAcademia) {
        this.idAcademia = idAcademia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelOfertado != null ? idNivelOfertado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelOfertado)) {
            return false;
        }
        NivelOfertado other = (NivelOfertado) object;
        if ((this.idNivelOfertado == null && other.idNivelOfertado != null) || (this.idNivelOfertado != null && !this.idNivelOfertado.equals(other.idNivelOfertado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.NivelOfertado[ idNivelOfertado=" + idNivelOfertado + " ]";
    }
    
}
