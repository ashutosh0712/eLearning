
package beans;

public class Topic {

private int TopicId;
private String TopicName;

public beans.Subject SubjectInfo = new Subject() ;

    public int getTopicId() {
        return TopicId;
    }

    public void setTopicId(int TopicId) {
        this.TopicId = TopicId;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

}
