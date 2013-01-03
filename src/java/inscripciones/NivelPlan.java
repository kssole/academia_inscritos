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
@Table(name = "nivel_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelPlan.findAll", query = "SELECT n FROM NivelPlan n"),
    @NamedQuery(name = "NivelPlan.findByIdNivelPlan", query = "SELECT n FROM NivelPlan n WHERE n.idNivelPlan = :idNivelPlan"),
    @NamedQuery(name = "NivelPlan.findByNombreNivel", query = "SELECT n FROM NivelPlan n WHERE n.nombreNivel = :nombreNivel"),
    @NamedQuery(name = "NivelPlan.findByUnidades", query = "SELECT n FROM NivelPlan n WHERE n.unidades = :unidades"),
    @NamedQuery(name = "NivelPlan.findByTotalHoras", query = "SELECT n FROM NivelPlan n WHERE n.totalHoras = :totalHoras"),
    @NamedQuery(name = "NivelPlan.findByIdNivel", query = "SELECT n FROM NivelPlan n WHERE n.idNivel = :idNivel"),
    @NamedQuery(name = "NivelPlan.findByIdAcademiaPlan", query = "SELECT n FROM NivelPlan n WHERE n.idAcademiaPlan = :idAcademiaPlan"),
    @NamedQuery(name = "NivelPlan.findByCalificacion", query = "SELECT n FROM NivelPlan n WHERE n.calificacion = :calificacion"),
    @NamedQuery(name = "NivelPlan.findByIdInstructor", query = "SELECT n FROM NivelPlan n WHERE n.idInstructor = :idInstructor"),
    @NamedQuery(name = "NivelPlan.findByAula", query = "SELECT n FROM NivelPlan n WHERE n.aula = :aula"),
    @NamedQuery(name = "NivelPlan.findByHorario", query = "SELECT n FROM NivelPlan n WHERE n.horario = :horario")})
public class NivelPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel_plan")
    private Integer idNivelPlan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_nivel")
    private String nombreNivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidades")
    private int unidades;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_horas")
    private int totalHoras;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel")
    private int idNivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_academia_plan")
    private int idAcademiaPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calificacion")
    private int calificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_instructor")
    private int idInstructor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "aula")
    private String aula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "horario")
    private String horario;

    public NivelPlan() {
    }

    public NivelPlan(Integer idNivelPlan) {
        this.idNivelPlan = idNivelPlan;
    }

    public NivelPlan(Integer idNivelPlan, String nombreNivel, int unidades, int totalHoras, int idNivel, int idAcademiaPlan, int calificacion, int idInstructor, String aula, String horario) {
        this.idNivelPlan = idNivelPlan;
        this.nombreNivel = nombreNivel;
        this.unidades = unidades;
        this.totalHoras = totalHoras;
        this.idNivel = idNivel;
        this.idAcademiaPlan = idAcademiaPlan;
        this.calificacion = calificacion;
        this.idInstructor = idInstructor;
        this.aula = aula;
        this.horario = horario;
    }

    public Integer getIdNivelPlan() {
        return idNivelPlan;
    }

    public void setIdNivelPlan(Integer idNivelPlan) {
        this.idNivelPlan = idNivelPlan;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getIdAcademiaPlan() {
        return idAcademiaPlan;
    }

    public void setIdAcademiaPlan(int idAcademiaPlan) {
        this.idAcademiaPlan = idAcademiaPlan;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelPlan != null ? idNivelPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelPlan)) {
            return false;
        }
        NivelPlan other = (NivelPlan) object;
        if ((this.idNivelPlan == null && other.idNivelPlan != null) || (this.idNivelPlan != null && !this.idNivelPlan.equals(other.idNivelPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.NivelPlan[ idNivelPlan=" + idNivelPlan + " ]";
    }
    
}
