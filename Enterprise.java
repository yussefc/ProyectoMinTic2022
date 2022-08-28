public class Enterprise {
    private long id;
    private String name;
    private String document;
    private String phone;git
    private String addres;
    private User [] users;
    private Transaccion[] transaccions;
    private date createdAt;
    private date updatedAt;

    public Enterprise(long id, String name, String document, String phone, String addres, User[] users, Transaccion[] transaccions, date createdAt, date updatedAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.addres = addres;
        this.users = users;
        this.transaccions = transaccions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Transaccion[] getTransaccions() {
        return transaccions;
    }

    public void setTransaccions(Transaccion[] transaccions) {
        this.transaccions = transaccions;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }

    public date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
