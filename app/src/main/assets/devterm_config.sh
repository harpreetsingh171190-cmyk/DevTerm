#!/data/data/com.devterm.app/files/usr/bin/bash

# DevTerm Default Setup

echo "Welcome to DevTerm 🚀"

# Update packages
pkg update -y

# Install developer tools
pkg install -y git python nodejs openssh curl wget nano vim

# Create workspace
mkdir -p ~/DevWorkspace

echo "DevTerm Developer Environment Ready"
