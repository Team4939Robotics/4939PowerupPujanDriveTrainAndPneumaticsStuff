package org.usfirst.frc.team4939.robot.commands;

import org.usfirst.frc.team4939.robot.Robot;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightStartAuto extends CommandGroup {

    public RightStartAuto(char direction) {
    	
    	addSequential(new PlatformUp());
    	// adjust timeout value to make it more efficient and drive distance
    	addSequential(new DriveCommand(200, 0.3, 10, 2.5));
    	
    	if(direction == 'L'){
    		addSequential(new BoxOuttake());
    		addSequential(new delay(1));
    		addSequential(new BoxStopIntake());
    	}
    	else {
    		addSequential(new DriveCommand(-10, 0.3, 2, 2.5));
    		// right now keep don't do anything but later change it to go around the switch and score on other side 
    	
    	}
    	
    }
}
