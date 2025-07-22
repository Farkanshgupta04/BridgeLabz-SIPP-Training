abstract class JobRole {
    String candidateName;
    JobRole(String candidateName) { this.candidateName = candidateName; }
    public String toString() { return candidateName; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) { super(name); }
}

class DataScientist extends JobRole {
    DataScientist(String name) { super(name); }
}

class ProductManager extends JobRole {
    ProductManager(String name) { super(name); }
}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }

    static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles)
            System.out.println("Screening: " + role);
    }
}