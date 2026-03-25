# if3210-ms1-tubes-2026
Template repository Tugas Besar MAD Milestone #1

## CLI MODE

make sure dependency exists
```
pacman -Q qemu-base libvirt
which sdkmanager
which avdmanager
which adb
which emulator
adb version
emulator -version
emulator -list-avds
ls /opt/android-sdk/system-images/android-35/google_apis/x86_64
grep '^image.sysdir.1' ~/.android/avd/Medium_Phone.avd/config.ini
lsmod | grep kvm
ls -l /dev/kvm
```

install emulator
```
sdkmanager "system-images;android-35;google_apis;x86_64"
avdmanager create avd -n Medium_Phone -k "system-images;android-35;google_apis;x86_64"
emulator -list-avds
```

run emulator session
```
QT_QPA_PLATFORM=xcb emulator -avd Medium_Phone -gpu off -no-snapshot
```

build
```
./gradlew installDebug
```

launch app at emulator (or just open directly)
```
adb shell monkey -p com.tit.nimons360 -c android.intent.category.LAUNCHER 1
```
