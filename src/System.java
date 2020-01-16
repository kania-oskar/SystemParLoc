public class System {
    public static void main(String[] args) {
        Parcel parcel1 = new ParcelA("AbC12345", 5.69);
        Parcel parcel2 = new ParcelB("dEf54321", 45.02);

        ParcelLocker parcelLocker = new ParcelLocker();
        parcelLocker.addPack(parcel1);
        parcelLocker.addPack(parcel2);

        parcelLocker.writeParcels();
        System.out.println("________");

        parcelLocker.takeOutParcel("AbC12345");
        System.out.println("________");
        
        parcelLocker.removeParcel("dEf54321");



    }
}
