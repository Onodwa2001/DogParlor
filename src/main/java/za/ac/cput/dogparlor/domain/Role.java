/*  Role.java
    Entity for staff roles
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 4 April 2023
*/

package za.ac.cput.dogparlor.domain;


public class Role {
    private int roleId;
    private String roleName;
    private String description;

    public Role(){}

    private Role(Builder builder){
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.description = builder.description;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


    public static class Builder{
        private int roleId;
        private String roleName;
        private String description;

        public Builder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Role role){
            this.roleId = role.roleId;
            this.roleName = role.roleName;
            this.description = role.description;
            return this;
        }

        public Role build(){
            return new Role(this);
        }
    }
}