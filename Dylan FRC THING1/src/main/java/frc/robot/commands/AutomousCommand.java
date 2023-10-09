// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.IntakeConstants;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;


public class AutonomousCommand extends SequentialCommandGroup {
  /** Creates a new AutoCommand. */
  public AutoCommand(DriveSubsystem driveSubsystem, IntakeSubsystem intakeSubsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
        new ParallelCommandGroup(
            new ArcadeDriveCommand(driveSubsystem, () -> DriveConstants.AUTO_DRIVE_SPEED, () -> 0.0).withTimeout(2),
            new IntakeCommand(intakeSubsystem, IntakeConstants.INTAKE_IN_SPEED)));
  }
}
