package cn.emedical.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.emedical.bean.User;
import cn.emedical.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class BaseAction extends ActionSupport{
	/** ��ȡ��ǰҳ **/
	private int page;
	/** �����Ƿ���в��� **/
	private String query;
	@Resource
	protected UserService userService;
	public int getPage() {
		return page<1? 1 : page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
}
