package com.cafeteria;
import com.google.firebase.auth.FirebaseAuth;
public class Connection {




        private static FirebaseAuth auth;


        public static FirebaseAuth Fireautenticacao(){
            if(auth == null){
                auth = FirebaseAuth.getInstance();
            }
            return auth;
        }
    }



