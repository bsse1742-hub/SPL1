
package bd.edu.du.iit.fintrack.model;

public class IndividualUser extends User {

    public IndividualUser(
            String userId,
            String name,
            String email
    ) {
        super(userId, name, email);
    }

    @Override
    public String getUserType() {
        return "Individual User";
    }
}