/*
https://leetcode.com/problems/design-front-middle-back-queue/
*/
class FrontMiddleBackQueue {
    ArrayList<Integer> que;
    public FrontMiddleBackQueue() {
        que = new ArrayList<Integer>();
    }
    
    public void pushFront(int val) {
        que.add(0, val);
    }
    
    public void pushMiddle(int val) {
        que.add(que.size() / 2, val);
    }
    
    public void pushBack(int val) {
        que.add(que.size(), val);
    }
    
    public int popFront() {
        if(que.size() < 1)
            return -1;
        int temp = que.get(0);
        que.remove(0);
        return temp;
    }
    
    public int popMiddle() {
        if(que.size() < 1)
            return -1;
        int temp;
        if(que.size() % 2 == 1)
        {
            temp = que.get(que.size() / 2);
            que.remove(que.size() / 2);
        }
        else
        {
            temp = que.get(que.size() / 2 - 1);
            que.remove(que.size() / 2 - 1);
        }
        return temp;
    }
    
    public int popBack() {
        if(que.size() < 1)
            return -1;
        int temp = que.get(que.size() - 1);
        que.remove(que.size() - 1);
        return temp;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */