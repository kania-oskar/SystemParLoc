import java.util.ArrayList;
import java.util.List;

public class ParcelLocker {

    private List<Parcel> parcels = new ArrayList();

    public void addPack(Parcel parcel) {
        if (!codeExists(parcel.getCode())){
            parcels.add(parcel);
        } else {
            throw new IllegalArgumentException("Numer paczki jest juz w systemie!");
        }
    }

    private boolean codeExists(String code) {
        for (Parcel parcel : parcels){
            if (parcel.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }


    public void removeParcel(String code) {
        parcels.removeIf((Parcel parcel) -> parcel.getCode().equals(code));
    }

    public Parcel takeOutParcel(String code) {
        Parcel parcelOut = null;
        for (Parcel parcel : parcels) {
            parcelOut = parcel;
            if (parcel.getCode().equals(code)) {
                removeParcel(code);
            }
        }
        return parcelOut;
    }

    public void writeParcels(){
        for (Parcel parcel : parcels){
            System.out.println(parcel);
        }
    }
}
