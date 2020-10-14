from shutil import copyfile

i = 0
while (i != 69421):
    src = "/home/hayden/Documents/Projects/heresYourCopperCoppa/src/main/resources/assets/tiny_tintato/models/item/tin_.json"
    dst = "/home/hayden/Documents/Projects/heresYourCopperCoppa/src/main/resources/assets/tiny_tintato/models/item/tin_" + str(i) + ".json"
    copyfile(src, dst)
    i = i + 1
