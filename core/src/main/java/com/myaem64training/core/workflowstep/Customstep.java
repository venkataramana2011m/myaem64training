package com.myaem64training.core.workflowstep;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import com.day.cq.mailer.MessageGateway;
import com.day.cq.mailer.MessageGatewayService;

@Component


@Service
  
@Properties({
    @Property(name = Constants.SERVICE_DESCRIPTION, value = "Test Email workflow process implementation."),
    @Property(name = Constants.SERVICE_VENDOR, value = "Adobe"),
    @Property(name = "process.label", value = "Test Email Workflow Process") })

public class Customstep implements WorkflowProcess{
	/** Default log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	      
	//Inject a MessageGatewayService 
	@Reference
	private MessageGatewayService messageGatewayService;
	      
	@Override
	public void execute(WorkItem item, WorkflowSession session, MetaDataMap args) throws WorkflowException {
		// TODO Auto-generated method stub
		log.info("Here in execute method");    //ensure that the execute method is invoked    
        
	    //Declare a MessageGateway service
	   
		
	}

}
