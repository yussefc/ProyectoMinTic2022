package udea.edu.com.empleado.empleado;

public class employed {
    private String name;
    private String email;
    private empresa empresaQuePertence;

    public employed(String name, String email, String empresaQuePertence, String rolEmpleado) {
        this.name = name;
        this.email = email;
        this.empresaQuePertence = empresaQuePertence;
        this.rolEmpleado = rolEmpleado;
    }

    private String rolEmpleado;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaQuePertence() {
        return empresaQuePertence;
    }

    public void setEmpresaQuePertence(String empresaQuePertence) {
        this.empresaQuePertence = empresaQuePertence;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}

