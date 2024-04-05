package Classes;

import java.time.LocalDate;
import java.util.List;

enum Permission {
    MANAGE_PRODUCTS,
    GENERATE_REPORTS,
    MANAGE_USERS,
}

public class AdminUser extends User {
    private boolean isAdmin;
    private List<Permission> permissions;
    private int accessLevel;

    public AdminUser(String name, String email, String address, LocalDate birthDate, boolean isAdmin, List<Permission> permissions, int accessLevel) {
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

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
}

