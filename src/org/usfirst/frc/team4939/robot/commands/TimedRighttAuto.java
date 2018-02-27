package org.usfirst.frc.team4939.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TimedRighttAuto extends CommandGroup {

    public TimedRighttAuto(char direction) {
    	// start in front of the switch
    	addSequential(new PlatformUp()); //get the platform out of starting position
    	
    	addSequential(new TimedDriveCommand(0.5,-0.5,4)); // drive up to right in front of the switch 
    	
    	if(direction == 'R'){
    		// outake onto the switch if on the right side
    		addSequential(new TimedOutake(0.5,1));
    		
    		// 2 cube auto??
    		addSequential(new TimedDriveCommand(-0.2,0.2,0.5));
    		addSequential(new PlatformDown());
    		addSequential(new BoxOpen());
    		addSequential(new TurnCommand(-90,0.5,2));
    		addSequential(new TimedDriveCommand(0.4,-0.4,2));
    		addParallel(new TimedOutake(-0.5,2));
    		addSequential(new BoxClose());
    		addSequential(new TimedDriveCommand(-0.4,0.4,2));
    		addSequential(new PlatformUp());
    		addSequential(new TurnCommand(0,0.5,2));
    		addSequential(new TimedDriveCommand(0.5,-0.5,0.2));
    		addSequential(new TimedOutake(0.5,1));
    		
    	}
    	
    	else{
    	// move back
    		addSequential(new TimedDriveCommand(-0.3,0.3,1));
    		addSequential(new TurnCommand(-90, 0.7, 2));
    		
    	// make it go to other side??
    	}
    	
    }
}
