
package bd.edu.du.iit.fintrack.model;

public class BusinessUser extends User {

    private String businessName;

    public BusinessUser(
            String userId,
            String name,
            String email,
            String businessName
    ) {
        super(userId, name, email);
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String getUserType() {
        return "Business User";
    }
}