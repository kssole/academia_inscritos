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
@Table(name = "academia_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AcademiaPlan.findAll", query = "SELECT a FROM AcademiaPlan a"),
    @NamedQuery(name = "AcademiaPlan.findByIdAcademiaPlan", query = "SELECT a FROM AcademiaPlan a WHERE a.idAcademiaPlan = :idAcademiaPlan"),
    @NamedQuery(name = "AcademiaPlan.findByPeriodo", query = "SELECT a FROM AcademiaPlan a WHERE a.periodo = :periodo"),
    @NamedQuery(name = "AcademiaPlan.findByIdAcademia", query = "SELECT a FROM AcademiaPlan a WHERE a.idAcademia = :idAcademia")})
public class AcademiaPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_academia_plan")
    private Integer idAcademiaPlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "periodo")
    private String periodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_academia")
    private int idAcademia;

    public AcademiaPlan() {
    }

    public AcademiaPlan(Integer idAcademiaPlan) {
        this.idAcademiaPlan = idAcademiaPlan;
    }

    public AcademiaPlan(Integer idAcademiaPlan, String periodo, int idAcademia) {
        this.idAcademiaPlan = idAcademiaPlan;
        this.periodo = periodo;
        this.idAcademia = idAcademia;
    }

    public Integer getIdAcademiaPlan() {
        return idAcademiaPlan;
    }

    public void setIdAcademiaPlan(Integer idAcademiaPlan) {
        this.idAcademiaPlan = idAcademiaPlan;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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
        hash += (idAcademiaPlan != null ? idAcademiaPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcademiaPlan)) {
            return false;
        }
        AcademiaPlan other = (AcademiaPlan) object;
        if ((this.idAcademiaPlan == null && other.idAcademiaPlan != null) || (this.idAcademiaPlan != null && !this.idAcademiaPlan.equals(other.idAcademiaPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.AcademiaPlan[ idAcademiaPlan=" + idAcademiaPlan + " ]";
    }
    
}
