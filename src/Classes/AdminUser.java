package Classes;

import Enums.Permissions;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class AdminUser extends User {
    private boolean isAdmin;
    private List<Permissions> permissions;
    private int accessLevel;

    public AdminUser(String name, String email, String address, LocalDate birthDate, boolean isAdmin, List<Permissions> permissions, int accessLevel) {
        super(name, email, address, birthDate);
        this.isAdmin = isAdmin;
        this.permissions = permissions;
        this.accessLevel = accessLevel;
    }
    

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "AdminUser {" +
                "\n    isAdmin: " + isAdmin() +
                "\n    permissions: " + getPermissions() +
                "\n    accessLevel: " + getAccessLevel() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminUser)) return false;
        AdminUser other = (AdminUser) o;
        return isAdmin == other.isAdmin &&
                Objects.equals(permissions, other.permissions) &&
                accessLevel == other.accessLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdmin, permissions, accessLevel);
    }


}

