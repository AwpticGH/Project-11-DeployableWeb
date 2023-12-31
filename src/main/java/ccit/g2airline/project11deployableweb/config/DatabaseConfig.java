package ccit.g2airline.project11deployableweb.config;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseConfig {

    private static final String DB_URL = "https://g2airline-8447d-default-rtdb.asia-southeast1.firebasedatabase.app/";

    public static DatabaseReference getReference(String path) {
        return FirebaseDatabase.getInstance(DB_URL).getReference(path).child("data");
    }

    public static DatabaseReference getReference(String[] paths) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference reference = db.getReference();
        for (String path : paths) {
            reference = reference.child(path);
        }
        return reference;
    }

}
