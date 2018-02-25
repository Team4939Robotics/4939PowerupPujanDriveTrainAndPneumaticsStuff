package org.usfirst.frc.team4939.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TimedLeftAuto extends CommandGroup {

    public TimedLeftAuto(char direction) {
    	// start in front of the switch
    	addSequential(new PlatformUp()); //get the platform out of starting position
    	
    	addSequential(new TimedDriveCommand(0.5,-0.5,4)); // drive up to right in front of the switch 
    	
    	if(direction == 'L'){
    		// outake onto the 
    		addSequential(new TimedOutake(0.5,1));
    	}
    	
    	else{
    	
    		addSequential(new TimedDriveCommand(-0.3,0.3,1));
    		addSequential(new TurnCommand(90, 0.7, 2));
    	}
    	
    }
}
