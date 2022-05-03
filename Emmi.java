class Emmi {
    public Emmi(int type1)
    {
            if (type1 == 1) {
            emmi_type = "Roomba";
    
            emmi_HP = 30 + (emmi_level * 2);
            sPrintln("A Roomba appears");
        }
        if (type1 == 2) {
            emmi_type = "Dog bot";
    
            emmi_HP = 35 + (emmi_level * 3);
            sPrintln("A Dog bot appears");
        }
        if (type1 == 3) {
            emmi_type = "Robot with a spear";
    
            emmi_HP = 25 + (emmi_level * 2);
            sPrintln("A Robot with a spear appears");
        }
        if (type1 == 4) {
            emmi_type = "Robot with a sword";
    
            emmi_HP = 30 + (emmi_level * 3);
            sPrintln("A Robot with a sword appears");
        }

        if (type1 == 5) {
            emmi_type = "Robot with a gun";
    
            emmi_HP = 40 + (emmi_level * 4);
            sPrintln("A Robot with a gun appears");
        }
        if (type1 == 6) {
            emmi_type = "Mech";
    
            emmi_HP = 200 + (emmi_level * 5);
            sPrintln("A Mech appears");
        }

        if (type1 == 7) {
            emmi_type = "Mini Mech";
    
            emmi_HP = 150 + (emmi_level * 4);
            sPrintln("A Mini Mech appears");
        }
        if (type1 == 8) {
            emmi_type = "Cyborg";
    
            emmi_HP = 125 + (emmi_level * 4);
            sPrintln("A Cyborg appears");
        }
    }
}