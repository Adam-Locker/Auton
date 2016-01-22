package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.Joystick;

public class OI {

	public double rightX(Joystick cont) {
		return cont.getRawAxis(RobotMap.CONT_RX);
	}

	public double rightY(Joystick cont) {
		return cont.getRawAxis(RobotMap.CONT_RY);
	}

	public double leftX(Joystick cont) { 
		return cont.getRawAxis(RobotMap.CONT_LX);
	}

	public double leftY(Joystick cont) {
		return cont.getRawAxis(RobotMap.CONT_LY);
	}
}