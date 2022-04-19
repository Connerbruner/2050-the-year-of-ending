class Dungon
{

Dungon dungon = new Dungon();
    Enter enter = new Enter();
    Attack attack = new Attack();
    Exp exp = new Exp();
    Boss boss = new Boss();
    Emmi emmi = new Emmi();
    int dungon_lenght = 0;
    int dungon_level = 0;
    public void battle():
    {
        while emmi.emmi_HP > 0:
        enter.print_slow("2069 health "+ attack.HP1);
        enter.print_slow("2077 health "+ attack.HP2);
        enter.print_slow(emmi.emmi_type+" health "+ emmi.emmi_HP);
        if attack.HP1 > 0:
        attack.attack1();

        if attack.HP2 > 0:
        attack.attack2();

        if attack.HP1 > attack.HP1m:
        attack.HP1 = attack.HP1m;

        if attack.HP2 > attack.HP2m:
        attack.HP2 = attack.HP2m;

        emmi.emmi_HP -= attack.damage;
        attack.damage=0;
        emmi.attack_emmi();


        if attack.HP2 < 0  attack.HP1 < 0:
        enter.restart();
        exp.gain();
        exp.level();
    }

    def dungon1():
    {
        dungon_lenght = 10;
        enter.print_slow("Welcome to the underground subway(length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069: We made it");
        else:
        enter.print_slow("2069: Whats that!");
        max=
                max=;int(2.5)
        type_num=random.randint(1,max);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);


        dungon.battle();
    }



    def dungon2():
    {
        dungon_lenght = 20;
        enter.print_slow("Welcome to rubble filled city (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        type_num=random.randint(1,9);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    def dungon3():
    {
        dungon_lenght = 5;
        enter.print_slow("Welcome to rubble filled 6-11 (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        type_num=random.randint(1,9);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    def dungon4():
    {
        dungon_lenght = 20;
        enter.print_slow("Welcome to damaged powerplant (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:

        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        type_num=random.randint(1,9);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    def dungon5():
    {
        dungon_lenght = 100;
        enter.print_slow("Welcome to highway 101 (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 15);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        type_num=random.randint(1,9);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    def dungon6():
    {
        dungon_lenght = 5;
        enter.print_slow("Welcome to rubble filled 6-11  (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        type_num=random.randint(1,9);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    def dungon7():
    {
        dungon_lenght = 20;
        enter.print_slow("Welcome to old factory (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.randint(1, 5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        emmi.new_emmi(1);
        dungon.battle();
        boss.roomba_beam();
    }
    def dungon8()
    {
        dungon_lenght = 50;
        enter.print_slow("Welcome to Central Fwy(length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps =random.randint(1,5);
        dungon_lenght -= steps;
        enter.print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        enter.print_slow("2069:We made it");
        else:
        enter.print_slow("2069:Whats that!");
        type_num=random.randint(1,9);
        if type_num>6:
        type_num=random.randint(1,9);
        emmi.new_emmi(type_num);
        dungon.battle();
    }
}
