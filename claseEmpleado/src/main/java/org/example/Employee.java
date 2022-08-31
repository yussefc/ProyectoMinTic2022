package udea.edu.com.empleado.empleado;
enum Enum_RolName{
    ADMIN,OPERARIO
}
public class employed {
    private long id;
    private String email;
    private Profile profile;
    private Enum_RolName rol;
    private Enterprise enterprise;
    private Transaction[] transactions;
    private date updatedAt;
    private date createdAt;

    public employed(long id, String email, Profile profile, udea.edu.com.empleado.empleado.Enum_RolName rol, Enterprise enterprise, Transaction[] transactions, date updatedAt, date createdAt, String rolEmpleado) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.rol = rol;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.rolEmpleado = rolEmpleado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public udea.edu.com.empleado.empleado.Enum_RolName getRol() {
        return rol;
    }

    public void setRol(udea.edu.com.empleado.empleado.Enum_RolName rol) {
        this.rol = rol;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }
}

