package au.com.midibak.service;

public class dockerService {
	
	public String getContainerId()
	{
		/* need to workaround for this method 
		 * //get the docker client DockerClient docker =
		 * DockerClientBuilder.getInstance(config).build(); //prepare command to
		 * retrieve the list of (running) containers ListContainersCmd listContainersCmd
		 * = client.listContainersCmd().withStatusFilter("running"); //and set the
		 * generic filter regarding name listContainersCmd.getFilters().put("name",
		 * Arrays.asList("redis")); //finally, run the command List<Container> exec =
		 * listContainersCmd.exec();
		 */
		
		return null;
	}

}
