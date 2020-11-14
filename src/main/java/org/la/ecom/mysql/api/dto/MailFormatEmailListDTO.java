package org.la.ecom.mysql.api.dto;

import java.io.Serializable;
import java.util.List;

public class MailFormatEmailListDTO implements Serializable{

	private static final long serialVersionUID = -6810754688448438811L;
	
	private List<String> mailList;
	private MailFormatDTO mailFormatDTO;
	
	public List<String> getMailList() {
		return mailList;
	}

	public void setMailList(List<String> mailList) {
		this.mailList = mailList;
	}

	public MailFormatDTO getMailFormatDTO() {
		return mailFormatDTO;
	}

	public void setMailFormatDTO(MailFormatDTO mailFormatDTO) {
		this.mailFormatDTO = mailFormatDTO;
	}
	
}
