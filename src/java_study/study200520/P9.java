package java_study.study200520;

public class P9 extends P8{
    public void vote(String pick){
        if(pick.equals("떡볶이"))
            voteForDuk();
        else if(pick.equals("순대"))
            voteForSun();
    }
    public void clear(){
        super.clear();
    }
    public int getVotes(String pick){
        if(pick.equals("떡볶이"))
            return getDukVotes();
        else if(pick.equals("순대"))
            return getSunVotes();
        else
            return 0;
    }

    public static void main(String[] args) {
        P9 vote = new P9();
        vote.vote("떡볶이");
        vote.vote("순대");
        System.out.println(vote.getVotes("떡볶이"));
        vote.clear();
        System.out.println(vote.getVotes("떡볶이"));
    }
}
