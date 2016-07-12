import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by madroid on 12-07-2016.
 */
public class StackAndQueue {

    Stack<Character>s = new Stack<>();
    Queue<Character>q = new LinkedList<>();

    void pushCharacter(char ch){
        s.push(ch);
    }
    void enqueueCharacter(char ch){
        q.add(ch);
    }
    char popCharacter(){
        if(!s.isEmpty()){
            return s.pop();
        }
        return '0';
    }
    char dequeueCharacter(){
        return q.remove();
    }
}
