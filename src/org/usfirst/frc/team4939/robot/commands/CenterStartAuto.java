package org.usfirst.frc.team4939.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterStartAuto extends CommandGroup {

    public CenterStartAuto(char direction) {
    	
    	addSequential(new PlatformUp());
    	// adjust timeout value to make it more efficient and drive distance
    	addSequential(new DriveCommand(10, 0.3, 10, 2.5));
    	
    	if(direction == 'L'){
    		addSequential(new TurnCommand(-45, 0.5, 2));
    		addSequential(new DriveCommand(20, 0.3, 3, 2.5));
    		addSequential(new TurnCommand(0, 0.5, 2));
    		addSequential(new DriveCommand(20, 0.3, 3, 2.5));
    		addSequential(new TimedOutake(0.5,1));
    	}
    	else {
    		addSequential(new TurnCommand(45, 0.5, 2));
    		addSequential(new DriveCommand(20, 0.3, 3, 2.5));
    		addSequential(new TurnCommand(0, 0.5, 2));
    		addSequential(new DriveCommand(20, 0.3, 3, 2.5));
    		addSequential(new TimedOutake(0.5,1));

    	}
    	
    }
}
