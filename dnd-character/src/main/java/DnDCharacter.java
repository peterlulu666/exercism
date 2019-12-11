import java.util.Random;

class DnDCharacter {

    int strength = 0;
    int dexterity = 0;
    int constitution = 0;
    int intelligence = 0;
    int wisdom = 0;
    int charisma = 0;
    int hitPoints = 0;


    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitPoints = 10 + modifier(this.constitution);

    }

    int ability() {
        var random = new Random();
        var score = new int[4];
        for (int i = 0; i < score.length; i++) {
            score[i] = random.nextInt(6) + 1;

        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                if (score[j] > score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;

                }

            }

        }
        int sum = 0;
        for (int i = 1; i < score.length; i++) {
            sum = sum + score[i];

        }

        return sum;

    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);

    }

    int getStrength() {
        return this.strength;

    }

    int getDexterity() {
        return this.dexterity;

    }

    int getConstitution() {
        return this.constitution;

    }

    int getIntelligence() {
        return this.intelligence;

    }

    int getWisdom() {
        return this.wisdom;

    }

    int getCharisma() {
        return this.charisma;

    }

    int getHitpoints() {
        return this.hitPoints;

    }

}
