package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.subsystems.Chassis;
import org.usfirst.frc.team4.robot.Robot;
import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class autonDrive extends Command {

	public autonDrive() {
		requires(Robot.chassis);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.chassis.tankDrive(.75, .75);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.chassis.stop();
	}

	protected void interrupted() {
		end();
	}
}
