package Models.dto;

import Models.Relationship;
import Models.User;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRelationshipDTO {

    @NotNull
    private User user;

    @NotNull
    private Relationship relationship;

    public UserRelationshipDTO(){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }
}

