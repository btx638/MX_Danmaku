package li.lingfeng.globaldanmakudroid.presenter;

import java.util.List;

import li.lingfeng.globaldanmakudroid.bean.DanDanCommentBean.Comment;
import master.flame.danmaku.danmaku.parser.IDataSource;

public class CommentBeanSource implements IDataSource<List<Comment>> {

    List<Comment> mComments;

    public CommentBeanSource(List<Comment> mComments) {
        this.mComments = mComments;
    }

    @Override
    public List<Comment> data() {
        return mComments;
    }

    @Override
    public void release() {
        mComments = null;
    }
}
