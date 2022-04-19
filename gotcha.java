
def pull1():
    expt = exp.exp1 + exp.exp2
    if expt > 0:
        print("2069 exp", exp.exp1)
        print("2069 exp", exp.exp2)
        print("total exp", expt)
        num = input("How much exp would you like to use?  ")
        num = float(num)
        if num > expt:
            num = expt
        pull_num = int(num / 25)
        exp.exp1-=num
        if exp.exp1<0:
            num=-(exp.exp1)
            exp.exp1=0
            exp.exp2-=num
        while pull_num>0:
            gotcha.roll()
            pull_num-=1
    else:
        print("YOU NEED MORE EXP POOR PERSON")


#Then it pull that much
#the pull function
def roll():
    tier = random.randint(1, 10)
    if tier == 5:
        tier = random.randint(1, 5)
        if tier == 5:
            tier = random.randint(1, 5)
    if tier == 10:
        tier = random.randint(6, 10)
        if tier == 10:
            tier = random.randint(6, 10)
    if tier == 9:
        tier = random.randint(6, 9)
    if tier == 4:
        tier = random.randint(1, 4)
    if tier == 1:
        attack.HP1m += 2
        enter.print_slow("2069's max Hp increased by 2")
    elif tier==1 or tier==2 or tier==3 or tier==4 or tier==5:
        num = random.randint(1, 4)
        if num == 4:
            if tier > exp.attack4_teir:
                enter.print_slow("ember leveled up")
                print(exp.attack4_teir, "-->", tier)
                if tier == 5:
                    exp.attack1_4 = "explosion"
                    exp.customspace_4 = "   "
                    exp.attack4_teir = 5
                    exp.attack1_4mp = 30

                if tier == 4:
                    exp.attack1_4 = "ember burst"
                    exp.customspace_4 = " "
                    exp.attack4_teir = 4
                    exp.attack1_4mp = 30

                if tier == 3:
                    exp.attack1_4 = "flame wheel"
                    exp.customspace_4 = " "
                    exp.attack4_teir = 3
                    exp.attack1_4mp = 30

                if tier == 2:
                    exp.attack1_4 = "dual ember"
                    exp.customspace_4 = "  "
                    exp.attack4_teir = 2
                    exp.attack1_4mp = 25
        if num == 3:
            if tier > exp.attack3_teir:
                enter.print_slow("Cure leveled up")
                print(exp.attack3_teir, "-->", tier)

                if tier == 5:
                    exp.attack1_3 = "Triple cure"
                    exp.customspace_3 = " "
                    exp.attack3_teir = 5
                    exp.attack1_3mp = 15

                if tier == 4:
                    exp.attack1_3 = "dual cure"
                    exp.customspace_3 = "  "
                    exp.attack3_teir = 4
                    exp.attack1_3mp = 30

                if tier == 3:
                    exp.attack1_3 = "cure burst"
                    exp.customspace_3 = "  "
                    exp.attack3_teir = 3
                    exp.attack1_3mp = 20

                if tier == 2:
                    exp.attack1_3 = "super cure"
                    exp.customspace_3 = "  "
                    exp.attack3_teir = 2
                    exp.attack1_3mp = 15
        if num == 1:
            if tier > exp.attack1_teir:
                enter.print_slow("Charge leveled up")
                print(exp.attack1_teir, "-->", tier)

                if tier == 5:
                    exp.attack1_1 = "recharge"
                    exp.customspace_1 = "    "
                    exp.attack1_teir = 5
                    exp.attack1_1mp = 0

                if tier == 4:
                    exp.attack1_1 = "dual charge"
                    exp.customspace_1 = " "
                    exp.attack1_teir = 4
                    exp.attack1_1mp = 0

                if tier == 3:
                    exp.attack1_1 = "power burst"
                    exp.customspace_1 = " "
                    exp.attack1_teir = 3
                    exp.attack1_1mp = 0

                if tier == 2:
                    exp.attack1_1 = "super charge"
                    exp.customspace_1 = " "
                    exp.attack1_teir = 2
                    exp.attack1_1mp = 0
        if num == 2:
            if tier > exp.attack2_teir:
                enter.print_slow("Laser leveled up")
                print(exp.attack2_teir, "-->", tier)
                if tier == 5:
                    exp.attack1_2 = "omega laser"
                    exp.customspace_2 = "  "
                    exp.attack2_teir = 5
                    exp.attack1_2mp = 10

                if tier == 4:
                    exp.attack1_2 = "tri laser"
                    exp.customspace_2 = "   "
                    exp.attack2_teir = 4
                    exp.attack1_2mp = 10

                if tier == 3:
                    exp.attack1_2 = "dual laser"
                    exp.customspace_2 = "   "
                    exp.attack2_teir = 3
                    exp.attack1_2mp = 10

                if tier == 2:
                    exp.attack1_2 = "laserbeam"
                    exp.customspace_2 = "    "
                    exp.attack2_teir = 2
                    exp.attack1_2mp = 10
    if tier == 6:
        attack.HP2m += 1
        enter.print_slow("2077's max Hp increased by 1")
    if tier == 7:
        attack.HP2m += 2
        enter.print_slow("2077's max Hp increased by 2")
    if tier == 8:
        attack.HP2m += 3
        enter.print_slow("2077's max Hp increased by 3")
    if tier == 9:
        attack.max_hit += 1
        enter.print_slow("2077's max number of hits per turn increased by 1")
    if tier == 10:
        attack.max_hit += 2
        enter.print_slow("2077's max number of hits per turn increased by 2")
    input("roll complete > enter <")

