
public class thispc {
  private String deviceName;
  private String processor;
  private int ram;
  private int storage;
  private int systemtype;

  public thispc(String deviceName, String processor, int ram, int storage, int systemtype) {
    super();
    this.deviceName = deviceName;
    this.processor = processor;
    this.ram = ram;
    this.storage = storage;
    this.systemtype = systemtype;
  }

  public void displayThispc() {
    System.out.println("deviceName:"+deviceName + " processor:" + processor + " RAM:" + ram+"gb" + " storage:" + storage+"Tb" + " " + systemtype+"bit"+" system");
  }
}

class Driver extends thispc {
  private String drivername;
  private String type;
  private String filesystem;
  protected double totalCap;
  private double useSpace;
  private double freeSpace;

  public Driver(String drivername, String type, String filesystem, double totalCap, double useSpace, double freeSpace,
      String deviceName,
      String processor, int ram, int storage, int systemtype) {
    super(deviceName, processor, ram, storage, systemtype);
    this.drivername = drivername;
    this.type = type;
    this.filesystem = filesystem;
    this.totalCap = totalCap;
    this.useSpace = useSpace;
    this.freeSpace = freeSpace;

  }

  public void displayDriver() {
    System.out.println(drivername + " " + type + " " + filesystem + " " + totalCap + " " + useSpace + "" + freeSpace);
  }
}

class Folder extends Driver {
  private String name;
  private String type1;
  private String created;
  private double size;
  private int files;

  public Folder(String name, String type1, String created, double size, int files, String drivername, String type,
      String filesystem, double totalCap, double useSpace, double freeSpace, String deviceName,
      String processor, int ram, int storage, int systemtype) {
    super(drivername, type, filesystem, totalCap, useSpace, freeSpace, deviceName,
        processor, ram, storage, systemtype);
    this.name = name;
    this.type1 = type1;
    this.created = created;
    this.size = size;
    this.files = files;
  }

  public void displauFolder() {
    System.out.println(name + " " + type1 + " " + created + " " + size + " " + " " + files);
  }
}

class File extends Folder {
  private String name1;
  private String type2;
  private double size1;
  private String created1;

  public File(String name1, String type2, double size1, String created1, String name, String type1, String created,
      double size, int files,
      String drivername, String type, String filesystem, double totalCap, double useSpace, double freeSpace,
      String deviceName,
      String processor, int ram, int storage, int systemtype) {
    super(name, type1, created, size, files, drivername, type, filesystem, totalCap, useSpace, freeSpace, deviceName,
        processor, ram, storage, systemtype);

    this.name1 = name1;
    this.type2 = type2;
    this.size1 = size1;
    this.created1 = created1;
  }

  public void displayFile() {
    System.out.println(name1 + " " + type2 + " " + size1 + " " + created1);
  }
}

class MultiLevelDriver {
  public static void main(String[] args) {
    File obj = new File("hellowWord", "java", 16, "23 may 2025", "javaprograms", "folder", "1 2 2025", 20, 5, "c/drive",
        "hardDisk", "fileSystem", 502, 140, 502 - 140, "lenovo",
        "Snapdrigon", 16, 2, 64);
    obj.displayThispc();
    obj.displayDriver();
    obj.displayDriver();
    obj.displayFile();

  }
}