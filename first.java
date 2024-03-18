public class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
                       throw new InternalError(e);
        }
    }

    public static void main(String[] args) {
        Organization org1 = new Organization("001", "ABC Corp", "123 Main St");
        Organization org2 = org1.clone();

        System.out.println("Original Organization:");
        org1.printDetails();

        System.out.println("\nCloned Organization:");
        org2.printDetails();
    }
}
