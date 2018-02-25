package org.usfirst.frc.team4939.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TimedCenterAuto extends CommandGroup {

    public TimedCenterAuto(char direction) {
    	// start in front of the switch
    	addSequential(new PlatformUp()); //get the platform out of starting position
    	
    	addSequential(new TimedDriveCommand(0.5,-0.5,1)); // drive up to right in front of the switch 
    	
    	if(direction == 'L'){
    		addSequential(new TurnCommand(-45, 0.5, 2));
    		addSequential(new TimedDriveCommand(0.3, -0.3, 1.5));
    		addSequential(new TurnCommand(0, 0.5, 2));
    		addSequential(new TimedDriveCommand(0.3, -0.3, 2.5));
    		addSequential(new TimedOutake(0.5,1));
    	}
    	else {
    		addSequential(new TurnCommand(45, 0.5, 2));
    		addSequential(new TimedDriveCommand(0.3, -0.3, 1.5));
    		addSequential(new TurnCommand(0, 0.5, 2));
    		addSequential(new TimedDriveCommand(0.3, -0.3, 2.5));
    		addSequential(new TimedOutake(0.5,1));

    	}
    	
    }
}
