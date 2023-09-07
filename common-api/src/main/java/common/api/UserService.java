package common.api;

/**
 * @Date 2023/9/7 16:42
 * @Author XiaoHu
 * @Description
 **/
public interface UserService {
    /**
     * @param name
     * @param password
     * @return boolean
     */
    public boolean login(String name,String password);
}
