/*  Role.java
    Entity for staff roles
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 4 April 2023
 */

package za.ac.cput.dogparlor.domain;

public class Role {
    private int idRole;
    private String roleName;

    public Role(){}

    private Role(Builder builder){
        this.idRole = builder.idRole;
        this.roleName = builder.roleName;
    }

    public int getIdRole() {
        return idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public static class Builder{
        private int idRole;
        private String roleName;

        public Builder setIdRole(int idRole) {
            this.idRole = idRole;
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder copy(Role role){
            this.idRole = role.idRole;
            this.roleName = role.roleName;
            return this;
        }

        public Role build(){
            return new Role(this);
        }
    }
}

