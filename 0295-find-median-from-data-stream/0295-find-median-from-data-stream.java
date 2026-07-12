class MedianFinder {

    PriorityQueue<Integer> minpq;
    PriorityQueue<Integer> maxpq;

    public MedianFinder() {

        minpq = new PriorityQueue<>();
        maxpq = new PriorityQueue<>(Collections.reverseOrder());
        
    }
    
    public void addNum(int num) {
        
        if(maxpq.size()==0)
         maxpq.offer(num);

        else if(num<maxpq.peek())
         maxpq.offer(num);

        else 
         minpq.offer(num);  

        if(maxpq.size()-minpq.size()>1)
         minpq.offer(maxpq.poll());

        else if(maxpq.size()-minpq.size()<0)
         maxpq.offer(minpq.poll()); 
    }
    
    public double findMedian() {

         int total = maxpq.size()+minpq.size();

         if(total%2==0)
          return (double)(maxpq.peek()+minpq.peek())/2;

         else 
          return (double)maxpq.peek(); 
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */