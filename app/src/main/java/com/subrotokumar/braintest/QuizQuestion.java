package com.subrotokumar.braintest;

import java.util.ArrayList;

public class QuizQuestion {
    ArrayList<QuestionModel> arrayList;

    public QuizQuestion() {
        arrayList=new ArrayList<>();
    }
    public QuizQuestion(ArrayList<QuestionModel> arrayList,int length) {
        this.arrayList = arrayList;
    }

    public ArrayList<QuestionModel> getQuizQuestion() {
        return arrayList;
    }

    public void setQuizQuestion() {
        arrayList.add(new QuestionModel("In which anime series is Ash Ketchum the main character?","Eyeshield 21","Pokemon","Cowboy Bebop","Super Dimension Fortress Macross",2));
        arrayList.add(new QuestionModel("Dragon Ball' was created by who in 1984?","Akira toriyama","Santoshi Tajiri","Hirohiko Araki","Hayao Miyazaki",1));
        arrayList.add(new QuestionModel("What is the name of Studio Ghibli's well known mascot ? ","kiki","Bakura","Ponyo","Totoro",4));
        arrayList.add(new QuestionModel("In 'Sailor Moon' the anime character Makoto Kino transforms","Sailor Mercury","Sailor Venus","Sailor Jupiter","Sailor Mars",3));
        arrayList.add(new QuestionModel("In 'Naruto',the main character, Naruto Uzumaki, is a host for the powerful Nine-Tales. What creature is the Nine-Tales?","Wolf","Fox","Bear","Cat",2));
        arrayList.add(new QuestionModel("Yubaba is a witch in which animated film written by Hayao Miyazaki?","Castle in the sky","Ocean waves","Pom Poko","Spirited Away",4));
        arrayList.add(new QuestionModel("Which anime series is set in the world of Amestris?","Naruto","Fullmetal Alchemist","Sailor Moon","Pokemon",2));
        arrayList.add(new QuestionModel("In 'Howl's Moving Castle, Sophie is transformed into an old woman by a witch. How old is Sophie as an old woman?","75 years old","87 years old","90 years old","101 yeras old",3));
        arrayList.add(new QuestionModel("In 'One Piece', Monkey D.Luffy originally sets out with the straw Hat Pirates to become the pirate king on which ship? ","Going Merry","Jolly Roger","Thousand Sunny","Ever darker",1));
        arrayList.add(new QuestionModel("Which planet is also known as the Dragon World in 'Dragon Ball'?","Earth","Mars","Jupiter","Neptune",1));

        arrayList.add(new QuestionModel("Which series is set in the dark underworld of Victorian London","Phantomhive","Black Clover","Valkyria Chronicles","Blue Exorcist",2));
        arrayList.add(new QuestionModel("In which anime series are Chief Daisuke Aramaki and Major Motoko Kusanag two of the main Characters?","Paranoia Agent","Dominion","Ghost in the cell","Fullmetal Alchemist",3));
        arrayList.add(new QuestionModel("Which sport is the focus of Eyeshield 21'?","Baseball","American Football","Tennis","Soccer",2));
        arrayList.add(new QuestionModel("In 'Cowboy Bebop' Ein is a genetically engineered dog with human levels of intelligence. Which breed of Dog is Ein?","Great Dane","Cavalier King Charles Spaniels","Dachshund","Pembrokeshire Welsh Corgi",4));
        arrayList.add(new QuestionModel("Which one of the following series is about time travel?","Steins;Gate","Darker than Black","City Hunter","Devilman",1));
        //arrayList.add(new QuestionModel("q","1","2","3","4",1));
    }
}
