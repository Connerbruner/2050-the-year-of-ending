class Emmi extends Tools {
    String emmi_type;
    int emmi_HP;
    int emmi_level;
    int emmi_attack;

    /**
     *
     */
    public Emmi(int type1, int level) {
        emmi_level = level;
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

    /**
     *
     */
    public Emmi(int level) {
        emmi_type = "Giga Mech";
        emmi_level = level;
        emmi_HP = 200 + (emmi_level * 20);
        sPrintln("Giga Mech crashes down");
    }

    /**
     *
     */
    public double[] attack_emmi(int attackTime, int attackStun) {
        double power = 1;
        int num = 0;
        //Roomba attacks
        if (emmi_type.equals("Roomba")) {
            if (emmi_attack == 1 && attackStun < 5) {

                power = 0.3;
                sPrintln("ROOMBA RUSH");
                num = emmi_HP * 2;
                sPrintln("Roomba deals " + num + " damage");
            }

            if (emmi_attack == 2 &&  attackStun < 3) {

                sPrintln("RECHARGE");
                num = (int) (emmi_HP * 0.5);
                sPrintln("Roomba heals " + num + " damage");
            }

            if (emmi_attack == 3 && attackStun < 6) {
                power = 0.6;
                sPrintln("CHARGE BEAM");
                num = (emmi_HP * random(1, 3));
                sPrintln("Roomba deals " + num + " damage");
            }

        }
        //Dog bot attacks
        if (emmi_type.equals("Dog bot")) {
            if (emmi_attack == 1 && attackTime < 12 && attackStun < 3) {

                power = 0.9;
                sPrintln("SPEED TACKLE");
                num = random(10, 15);
                sPrintln("Dog Bot deals " + num + " damage");
            }

            if (emmi_attack == 2 && attackStun < 7) {

                power = 0.2;
                sPrintln("BATTERY RAM");
                num = random(10, 50);
                sPrintln("Dog Bot deals " + num + " damage");
            }

            if (emmi_attack == 3 && attackStun < 4) {
                power = 0.75;
                sPrintln("BITE RUSH");
                num = random(5, 25);
                sPrintln("Dog Bot deals " + num + " damage");
            }
        }
        return new double[]{num, power};
    }

    public void emmi_prep() {
        emmi_attack = random(1, 3);
        if (emmi_type.equals("Roomba")) {
            if (emmi_attack == 1) {
                sPrintln("ROOMBA RUSH");
            }
            if (emmi_attack == 2) {
                sPrintln("RECHARGE");
            }
            if (emmi_attack == 3) {
                sPrintln("DARK RUSH");
            }
        }
        if (emmi_type.equals("Dog bot")) {
            if (emmi_attack == 1) {
                sPrintln("SPEED TACKLE");
            }
            if (emmi_attack == 2) {
                sPrintln("BATTERY RAM");
            }
            if (emmi_attack == 3) {
                sPrintln("BITE FURY");
            }
        }
        if (emmi_type.equals("Robot with a sword")) {
            if (emmi_attack == 1) {
                sPrintln("TRIPLE SLASH");
            }
            if (emmi_attack == 2) {
                sPrintln("BLADE OF DESTRUCTION");
            }
            if (emmi_attack == 3) {
                sPrintln("ZERO SLASH");
            }
        }
        if (emmi_type.equals("Robot with a gun")) {
            if (emmi_attack == 1) {
                sPrintln("BULLET RUSH");
            }
            if (emmi_attack == 2) {
                sPrintln("ZERO BLAST");
            }
            if (emmi_attack == 3) {
                sPrintln("POWER SHOT");
            }
        }
        if (emmi_type.equals("Robot with a spear")) {
            if (emmi_attack == 1) {
                sPrintln("SPEAR RUSH");
            }
            if (emmi_attack == 2) {
                sPrintln("ZERO SPEAR");
            }
            if (emmi_attack == 3) {
                sPrintln("ULTIMATE SPEAR");
            }
        }
        if (emmi_type.equals("Giga Mech")) {
            if (emmi_attack == 1) {
                sPrintln("LASER RAIN");
            }
            if (emmi_attack == 2) {
                sPrintln("DUAL BLADE");
            }
            if (emmi_attack == 3) {
                sPrintln("ZERO BEAM");
            }
        }
        if (emmi_type.equals("Mech")) {
            if (emmi_attack == 1) {
                sPrintln("LASER RAIN");
            }
            if (emmi_attack == 2) {
                sPrintln("POWER BURST");
            }
            if (emmi_attack == 3) {
                sPrintln("ULTIMATE RUSH");
            }
        }
        if (emmi_type.equals("Mini Mech")) {
            if (emmi_attack == 1) {
                sPrintln("LASER SHOT");
            }
            if (emmi_attack == 2) {
                sPrintln("POWER BURST");
            }
            if (emmi_attack == 3) {
                sPrintln("TRIPLE SLASH");
            }
        }
        if (emmi_type.equals("Cyborg")) {
            if (emmi_attack == 1) {
                sPrintln("LASER SHOT");
            }
            if (emmi_attack == 2) {
                sPrintln("LASER SLASH");
            }
            if (emmi_attack == 3) {
                sPrintln("CHARGE BEAM");
            }
        }
    }
}