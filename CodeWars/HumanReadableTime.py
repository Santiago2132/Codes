"""
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
"""
def make_readable(seconds):
    if seconds < 0:
        print("It's a negative time bro?")
        return seconds
    else:
        hh = mm = ss = 0
        hh = seconds // 3600
        seconds %= 3600
        mm = seconds // 60
        seconds %= 60
        ss = seconds
        hh = f"{hh:02d}"
        mm = f"{mm:02d}"
        ss = f"{ss:02d}"
        time = f"{hh}:{mm}:{ss}"
        return time
print(make_readable(13123123))