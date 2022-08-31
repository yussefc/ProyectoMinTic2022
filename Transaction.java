public class MovimientoDinero {
    private long id;
    private String concept;
    private float amount;
    private User user;
    private Entrerprise entrerprise;
    private date createdAt;
    private date updateAt;

    public MovimientoDinero(long id, String concept, float amount, User user, Entrerprise entrerprise, date createdAt, date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.entrerprise = entrerprise;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Entrerprise getEntrerprise() {
        return entrerprise;
    }

    public void setEntrerprise(Entrerprise entrerprise) {
        this.entrerprise = entrerprise;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }

    public date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(date updateAt) {
        this.updateAt = updateAt;
    }
}
