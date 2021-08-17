package mode.responsibility_chain;

/**
 * @author Yore
 * @date 2021/8/17 10:36
 * @description
 */
public abstract class Handler {
    private Handler nextHandler;

    //每个处理者都必须对请求做出处理
    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者
            }
        }
        return response;
    }


    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }


    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);

}
