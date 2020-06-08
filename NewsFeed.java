/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

  private Post[] messages;
  private int size;
  public static final int MAX_SIZE = 25;

  public NewsFeed() {
    count=0;
    posts=new Post[MAX_SIZE];

  }

  public void add(Post message) {
    if(count<MAX_SIZE) {
      posts(count) = post;
      count++;
        

  }

  public Post get(int index) {
    return messages[index];
  }

  public int size() {
    return size;
  }

  public void sort(){
    int i, j, argMin;
    Post tmp;
    for (i = 0; i < size - 1; i++) {
      argMin = i;
      for (j = i + 1; j < size(); j++) {
        if (messages[j].compareTo(messages[argMin]) < 0) {
          argMin = j;
        }
      }

      tmp = messages[argMin];
      messages[argMin] = messages[i];
      messages[i] = tmp;
    }

  }

  public NewsFeed getPhotoPost(){
    PhotoPost photoPost= new Newsfeed();
    feed.addPost(photoPost);
    return feed;

  }

  public NewsFeed plus(NewsFeed other){
    int size = other.size();
    NewsFeed combinationFeed= new NewsFeed();
    
    for (int i = 0; i <count; i++){
      combinationFeed.addPost(posts[i]);
      
      for(int j = count;j<MAX_SIZE; j++){
        if(other.getPost[j]!=null){
          combinationFeed.addPost(other.getPost(j));
   } else {
          break;


    

  }

}
