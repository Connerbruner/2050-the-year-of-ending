public class BossAttack extends  Tools{
    int high;
    int low;
    String type;
    String name;
    Phase currentPhase;

    public BossAttack(int l,int h,String n)
    {
        type="";
        low=l;
        high=h;
        name=n;
    }
    public BossAttack(String t,Phase cur,String n)
    {
        type=t;
        currentPhase=cur;
        name=n;
    }
    public int do_damage()
    {

        if(type=="p")
        {
            return currentPhase.getHP()/2;
        }
        if(type=="r")
        {
            return currentPhase.getHPM()-currentPhase.getHP();
        }
        if(type=="")
        {
            return random(low,high);
        }

        return 0;
    }
}
/** PLEASE READ THROUGH CODE FOR ATTACK TYPES
     public void attack_bill() {

     int bill = random(1, 3);
     if (bill_HP > 0) {
     //small bit of smarts
     if (target == 0) {
     bill = 1;
     }
     //target attack
     if (bill == 1) {
                target = random(1, 2);

                if (target == 1) {
                    sPrintln("Bill is now targeting 2069.");
                }


                if (target == 2) {
                    sPrintln("Bill is now targeting 2077.");
                }


            }
            //slash rage attack
            if (bill == 2) {
                sPrintln("SLASH RAGE");

                if (target == 1) {
                    hit = random(5, 15);
                    HP1 -= hit;
                    sPrintln("Bill deals  " + hit + "  damage to 2069.");
                }


                if (target == 2) {
                    hit = random(5, 15);
                    sPrintln("Bill deals  " + hit + "  damage to 2077");
                }


                if (target == 1) {
                    sPrintln("Bill has stopped targeting 2069.");
                }


                if (target == 2) {
                    sPrintln("Bill has stopped targeting 2077.");
                }


                target = 0;
            }
            //Triple slash attack
            if (bill == 3) {
                sPrintln("TRIPLE SLASH");

                int triple = random(0, 3);

                while (triple > 0) {
                    if (target == 2) {
                        sPrintln("Bill deals 5 damage to 2077.");
                    }

                    if (target == 1) {
                        sPrintln("Bill deals 5 damage to 2069.");

                        HP1 -= 5;
                    }
                    triple -= 1;
                }
            }
        }

    }

    //Elon musk attack
    public void attack_Elon() {
        int bill = random(1, 3);
        //heals musk
        if (bill == 1) {
            sPrintln("HEALING MIST");
            Elon_HP += 10;
            sPrintln("Elon heals 10 damage");
        }
        //lowers your MP
        if (bill == 2) {
            sPrintln("SPEAR RUSH");
            num = random(1, 2);
            if (num == 1) {
                damage = random(5, 15);
                sPrintln("2077 take  " + damage + " damage");
            }
            if (num == 2) {
                damage = random(5, 15);
                sPrintln("2060 take  " + damage + " damage");
            }

        }
        //Deals damage
        if (bill == 3) {
            sPrintln("BURNING SPEAR");
            damage = random(5, 10);
            HP1 -= damage;
            sPrintln("2069 and 2077 take  " + damage + " damage");
        }
    }


    //jeff bezos attack
    public void jeff_attack() {
        sPrintln("MIND BEND");
        damage = random(1, 4);
        HP1 -= damage * random(1, 3);
        sPrintln("2069 and 2077 take a random amount of damage");
    }

    //sets 2069s and 2077s hp to 1
    public void roomba_beam() {
        sPrintln("ROOMBA BEAM");
        sPrintln("2069 and 2077 both are now no 1 HP");
        HP1 = 1;
    }

    //Fight all the tech giants


    //The trio boss rush
    public void Tri_attack() {

        sPrintln("TRI FORCE");
        damage = 0;
        int people_num = (Tri_HP / 200) + 1;
        int person = random(1, 2);
        if (person == 1) {
            person = 2069;
        }
        if (person == 2) {
            person = 2077;
        }
        if (people_num == 4) {
            sPrintln("FULL ON RUSH");
            sPrintln("Elon musk: " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Bill gates: RAGE SLASH");
            num = random(10, 20);
            sPrintln("Bill Gates deals " + num + " Damage and takes " + (num / 3) + " damage");
            System.out.println();
            Tri_HP -= num / 3;
            damage += num;
            sPrintln("Jeff bezos) RANDOM FORCE");
            sPrintln("Everyone takes a random amount of damage");
            damage += random(-10, 20);
            Tri_HP += random(-10, 20);
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 7);
            int num1 = random(2, 7);
            int num2 = random(2, 7);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (people_num == 3) {
            sPrintln("TRI RUSH");
            sPrintln("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Bill Gates) RAGE SLASH");
            num = random(10, 20);
            sPrintln("Bill Gates deals " + num + " Damage and takes " + (num / 2) + " damage");
            System.out.println();
            Tri_HP -= num / 2;
            damage += num;
            sPrintln("Jeff bezos) RANDOM FORCE");
            sPrintln("Everyone takes a random amount of damage");
            damage += random(-20, 20);
            Tri_HP += random(-20, 20);
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 5);
            num1 = random(2, 5);
            num2 = random(2, 5);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (people_num == 2) {
            sPrintln("DUAL RUSH");
            sPrintln("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Jeff bezos) RANDOM FORCE");
            sPrintln("Everyone takes a random amount of damage");
            damage += random(-20, 20);
            Tri_HP += random(-20, 20);
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 5);
            num1 = random(2, 5);
            num2 = random(2, 5);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (people_num == 1) {
            sPrintln("SOLO RUSH");
            sPrintln("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 5);
            num1 = random(2, 5);
            num2 = random(2, 5);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (person == 2069) {
            HP1 -= damage;
        }
    }


    }

    //Final boss attack
    public void Mark() {
        int Mark = random(1, 5);
        if (Mark == 3) {
            if (Mark_Zuckerberg - 20 <= 10) {
                Mark = 2;
            }
        }
        if (Mark_Zuckerberg < 50) {
            Mark = 2;
        }
        if (HP1 != 1) {
            Mark = 1;
        }
        if (Mark == 1) {
            sPrintln("FINAL SLASH");
            sPrintln("2069 and 2077 both are now no 1 HP");
            HP1 = 1;
        }
        if (Mark == 2) {
            sPrintln("LASH OUT");
            HP1 -= (300 - Mark_Zuckerberg) / 4;
            sPrintln("Both 2069 and 2077 take  " + ((300 - Mark_Zuckerberg) / 4) + " damage");
        }

        if (Mark == 3) {

            sPrintln("DOUBLE EDGED RUSH");

            HP1 -= 20;
            Mark_Zuckerberg -= 20;

            sPrintln("Everyone takes 20 damage");
        }
        if (Mark == 4) {
            sPrintln("DARK RUSH");
            hit = 4;
            while (hit > 0) {
                num = random(1, 2);
                if (num == 1) {
                    HP1 -= 5;
                    sPrintln("2069 takes 5 damage");
                    hit = random(0, 3);
                }
                if (num == 2) {
                    sPrintln("2077 takes 5 damage");
                    hit = random(0, 3);
                }
            }
        }
        if (Mark == 5) {
            sPrintln("FIRE BLADE OF DARKNESS");
     num = random(1, 2);
     if (num == 1) {
     HP1 -= 30;
     sPrintln("2069 takes 30 damage");
     }
     if (num == 1) {
     sPrintln("2077 takes 30 damage");
     }
     }
     }
     **/
}
