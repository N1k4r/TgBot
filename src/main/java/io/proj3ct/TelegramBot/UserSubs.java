package io.proj3ct.TelegramBot;

import java.util.*;

public class UserSubs {
    private long id;
    private Map<String, String> request = new HashMap<>();
    private Queue<String> personalSubs = new PriorityQueue<>();

    public boolean setSub(String request, String url) {
        if (this.request.containsKey(request))
            return false;

        this.request.put(request, url);
        return true;
    }

    public boolean deleteSub(String request){
        return this.request.remove(request, this.request.get(request));
    }

    public int listSizeSub(){
        return request.size();
    }

    public boolean keyExist(String request){
        return this.request.containsKey(request);
    }

    public String getValue(String key){
        return request.get(key);
    }

    public Set<String> getKey(){
        return request.keySet();
    }

    public void setPersonalSubs(Queue<String> personalSubs) {
        this.personalSubs = personalSubs;
    }

    public String pollQueue(){
        return  personalSubs.poll();
    }

    public boolean emptyQueue(){
        return personalSubs.isEmpty();
    }

}
